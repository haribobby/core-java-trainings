package com.trainings.oops.interfacee;

interface JSEngine {

	String localstorage();

	String sessionStorage();
	// JS engine logics
}

interface IBrowser { // Specification

	void bTag();

	void pTag();

	void divTag();

}

class Chrome implements IBrowser, JSEngine {

	JSEngine jsEngine;

	@Override
	public String localstorage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sessionStorage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void bTag() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pTag() {
		// TODO Auto-generated method stub

	}

	@Override
	public void divTag() {
		// TODO Auto-generated method stub

	}

}

class Safari implements IBrowser {

	@Override
	public void bTag() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pTag() {
		// TODO Auto-generated method stub

	}

	@Override
	public void divTag() {
		// TODO Auto-generated method stub

	}

}

class FireFox implements IBrowser {

	@Override
	public void bTag() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pTag() {
		// TODO Auto-generated method stub

	}

	@Override
	public void divTag() {
		// TODO Auto-generated method stub

	}

}
