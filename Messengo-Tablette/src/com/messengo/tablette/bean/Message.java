package com.messengo.tablette.bean;

import java.io.Serializable;

public class Message implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2900535537414869385L;
	
	private boolean mine;
	private String	msg;
	private String	date;
	private Integer	id;
	private Integer	stat;
	
	public static final Integer SENDING = 0;
	public static final Integer SENDED = 1;
	public static final Integer SEND_EROOR = 2;
	
	public Message(){
		stat = SENDED;
		mine = true;
		msg = "";
		date = "";
		id = -1;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (mine ? 1231 : 1237);
		result = prime * result + ((msg == null) ? 0 : msg.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mine != other.mine)
			return false;
		if (msg == null) {
			if (other.msg != null)
				return false;
		} else if (!msg.equals(other.msg))
			return false;
		return true;
	}
	
	/**
	 * @return the mine
	 */
	public boolean isMine() {
		return mine;
	}
	/**
	 * @param mine the mine to set
	 */
	public void setMine(boolean mine) {
		this.mine = mine;
	}
	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}
	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the stat
	 */
	public Integer getStat() {
		return stat;
	}
	/**
	 * @param stat the stat to set
	 */
	public void setStat(Integer stat) {
		this.stat = stat;
	}
}
