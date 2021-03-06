package com.capg.otms.user.controller;


	import org.springframework.http.HttpStatus;
	import org.springframework.web.bind.annotation.ControllerAdvice;
	import org.springframework.web.bind.annotation.ExceptionHandler;
	import org.springframework.web.bind.annotation.ResponseStatus;
	import org.springframework.web.bind.annotation.RestController;

	import com.capg.otms.user.exceptions.UserNotFoundException;

	@ControllerAdvice
	@RestController
	public class UserErrorController {

		@ExceptionHandler(UserNotFoundException.class)
		@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Question Not Found" , code = HttpStatus.NOT_FOUND)
		public void handleQuestionNotFoundException() {
			
		}
		
		@ExceptionHandler(Exception.class)
		@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Invalid Data" , code = HttpStatus.BAD_REQUEST)
		public void handleException() {
			
		}
		
	}


