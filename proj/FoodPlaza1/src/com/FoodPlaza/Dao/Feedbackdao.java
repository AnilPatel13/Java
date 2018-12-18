package com.FoodPlaza.Dao;

import java.util.List;

import com.FoodPlaza.Pojo.Feedback21136;

public interface Feedbackdao {
	boolean sendfeedback(Feedback21136 f);
	List<Feedback21136>getallfeedback();
}
