package jc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import jc.entity.Message;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class MessageReceiverService {

	@Autowired
	private Gson gson;
	
	public void receiveMessage(String msg) {
		Message message = gson.fromJson(msg, Message.class);
		log.info("message Received -> " + message );
	}
}
