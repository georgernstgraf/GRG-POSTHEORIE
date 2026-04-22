class Person {

	private _hashcode;

	Person (name, geburtsjahr, land) {
		this._hashcode = Objects.hash(name, geburtsjahr, land);
	}

	@Override
	public long hashcode() {
		return this._hashcode;
	}	
}
