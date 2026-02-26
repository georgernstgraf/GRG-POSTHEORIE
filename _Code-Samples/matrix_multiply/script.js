//1.APPLICATION STATE OBJECT
//2.DOM Node Refs
const btn_clear_1 = document.getElementById("btn_clear_1");
const btn_clear_2 = document.getElementById("btn_clear_2");
const btn_validate_1 = document.getElementById("btn_validate_1");
const btn_validate_2 = document.getElementById("btn_validate_2");
const btn_calculate = document.getElementById("btn_calculate");
const matrix_1 = document.getElementById("matrix_1");
const matrix_2 = document.getElementById("matrix_2");
const toastLiveExample = document.getElementById("liveToast");
const toast_body = document.getElementById("toast_body");
const output = document.getElementById("output");

//3.DOM Node Creation Fn's
//4.RENDER FN
//5.EVENT HANDLERS
function showToast({ msg, error }) {
    const toastBootstrap = bootstrap.Toast.getOrCreateInstance(
        toastLiveExample,
    );
    toastLiveExample.classList.remove("bg-danger");
    toastLiveExample.classList.add("bg-success");
    toastBootstrap.show();
    toast_body.textContent = msg;
    if (error) {
        toastLiveExample.classList.add("bg-danger");
        toastLiveExample.classList.remove("bg-success");
    }
}
function matrix_toString(matrix) {
    return `  [\n${
        matrix.map((line) => `[${line.join(", ")}]`).join(",\n")
    }\n  ]`;
}
function validateMatrix(elt) {
    let matrix = elt.value;
    try {
        matrix = JSON.parse(matrix);
        if (!Array.isArray(matrix)) {
            throw new Error("Matrix is not an array.");
        }
        for (let i = 0; i < matrix.length; i++) {
            if (!Array.isArray(matrix[i])) {
                throw new Error(`Line ${i} is not an array.`);
            }
            for (let j = 0; j < matrix[i].length; j++) {
                if (typeof matrix[i][j] !== "number") {
                    throw new Error(`Line ${i}, column ${j} is not a number.`);
                }
            }
        }
        showToast({ msg: "Matrix is valid." });
    } catch (error) {
        showToast({ msg: error.message, error: true });
    }
}
function multiply() {
    // TODO Annahme alle sind quadratisch und gleich groß
    const matrix1 = JSON.parse(matrix_1.value);
    const matrix2 = JSON.parse(matrix_2.value);
    const n = matrix1.length;
    const rv = Array(n).fill().map(() => Array(n).fill(0));
    for (let z = 0; z < n; z++) {
        for (let s = 0; s < n; s++) {
            for (let i = 0; i < n; i++) {
                rv[z][s] += matrix1[z][i] * matrix2[i][s];
            }
        }
    }
    output.textContent = matrix_toString(rv);
}
//6.INIT BINDINGS
btn_clear_1.addEventListener("click", () => {
    matrix_1.value = "";
});
btn_clear_2.addEventListener("click", () => {
    matrix_2.value = "";
});

btn_validate_1.addEventListener("click", () => {
    validateMatrix(matrix_1);
});
btn_validate_2.addEventListener("click", () => {
    validateMatrix(matrix_2);
});
btn_calculate.addEventListener("click", multiply);

//7.INITIAL RENDER
matrix_2.value = "";
matrix_1.value = "";
