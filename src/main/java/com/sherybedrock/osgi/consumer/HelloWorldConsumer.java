package com.sherybedrock.osgi.consumer;

import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.sherybedrock.osgi.provider.able.HelloWorldService;

public class HelloWorldConsumer implements ActionListener {
	private final HelloWorldService service;
	private final Timer timer;

	public HelloWorldConsumer(HelloWorldService service) {
		super();

		this.service = service;

		timer = new Timer(5000, this);
	}

	public void startTimer() {
		timer.start();
	}

	public void stopTimer() {
		timer.stop();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		service.hello();
	}
}