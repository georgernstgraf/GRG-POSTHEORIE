const adj1 = [
    [0, 1, 0],
    [1, 0, 1],
    [0, 1, 0],
];
const adj2 = [
    [0, 1, 1],
    [1, 0, 1],
    [1, 1, 0],
];
const adj = adj2;
function printAdj(matrix) {
    for (let z = 0; z < matrix.length; z++) {
        console.log(`Zeile ${z}: ${matrix[z].join(" ")}`);
    }
}
function multiply(m_A, m_B) {
    // TODO
    const rv = [];
    for (let z = 0; z < m_A.length; z++) {
        rv.push(Array(m_A[z].length).fill(NaN));
    }
    for (let z = 0; z < m_A.length; z++) {
        for (let s = 0; s < m_A[z].length; s++) {
            let wert = 0;
            for (let i = 0; i < m_A[z].length; i++) {
                wert += m_A[z][i] * m_B[i][s];
            }
            rv[z][s] = wert;
        }
    }
    return rv;
}
console.log("Adjazenzmatrix:");
printAdj(adj);

console.log("Quadrat:");
const a2 = multiply(adj, adj);
printAdj(a2);

console.log("Kubik:");
const a3 = multiply(a2, adj);
printAdj(a3);
