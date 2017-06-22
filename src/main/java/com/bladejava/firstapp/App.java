package com.bladejava.firstapp;

import com.blade.Blade;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Blade.me().get("/", ((request, response) -> response.text("hello blade."))).addStatics("/zhuangbi").showFileList(true).start();
	}
}
