package com.foodplaza.dao;

import java.util.List;

import com.foodplaza.pojo.feedback;

public interface feedbackdao 
{
	boolean sendfeedback(feedback f);
	List<feedback>getallfeedback();
}
