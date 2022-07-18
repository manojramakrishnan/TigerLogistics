package com.tigerlogistics.main.model;

import java.io.Serializable;

public interface Model <T extends Serializable> extends Serializable {
	
	T getId();
}