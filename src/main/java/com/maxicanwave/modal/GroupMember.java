package com.maxicanwave.modal;

public class GroupMember {
	
	private int id;
	private int g_id;
	private int u_id;
	private int task;
	private int task_status;
	
	public GroupMember() {
		super();
		// TODO Auto-generated constructor stub
	}







	public GroupMember(int id, int g_id, int u_id, int task, int task_status) {
		super();
		this.id = id;
		this.g_id = g_id;
		this.u_id = u_id;
		this.task = task;
		this.task_status = task_status;
	}







	public int getTask_status() {
		return task_status;
	}







	public void setTask_status(int task_status) {
		this.task_status = task_status;
	}







	public int getTask() {
		return task;
	}





	public void setTask(int task) {
		this.task = task;
	}





	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getG_id() {
		return g_id;
	}


	public void setG_id(int g_id) {
		this.g_id = g_id;
	}


	public int getU_id() {
		return u_id;
	}


	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	
	
	

}
