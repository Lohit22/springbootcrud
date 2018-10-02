package com.observer;

import java.util.Observable;
import java.util.Observer;

import com.hth.lohit.model.Orders;

public class orderDispatcher extends Observable {

	private Orders order;
	
	public orderDispatcher() {
		
	}
	
	public void changed() {
		setChanged();
		notifyObservers(order);
	}

	
	
	

}
