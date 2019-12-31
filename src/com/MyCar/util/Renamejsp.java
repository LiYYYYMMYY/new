package com.MyCar.util;

import java.io.File;

public class Renamejsp {
	public static void main(String[] args) {
		File dir=new File("D:\\JavaeeProjects\\MyCar\\WebContent");
		File[] files=dir.listFiles();
		for(File f:files) {
			if(f.isFile()) {
				String lastname=f.getName().substring(0,f.getName().lastIndexOf("."));
				f.renameTo(new File(dir,lastname+".jsp"));
			}
		}
	}
}
