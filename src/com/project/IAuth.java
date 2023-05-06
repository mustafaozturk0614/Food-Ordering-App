package com.project;

public interface IAuth {

	<T> T register(T t);

	void login();

}
