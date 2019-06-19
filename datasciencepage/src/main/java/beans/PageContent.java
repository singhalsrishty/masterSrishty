package beans;

import java.util.Date;

/**
 * @author Srishty
 *
 */
public class PageContent {
	
	private Date todayDate;
	private String authorName;
	private String topic;
	private String para1;
	private String para2;
	
	public Date getTodayDate() {
		return todayDate;
	}
	public void setTodayDate(Date todayDate) {
		this.todayDate = todayDate;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getPara1() {
		return para1;
	}
	public void setPara1(String para1) {
		this.para1 = para1;
	}
	public String getPara2() {
		return para2;
	}
	public void setPara2(String para2) {
		this.para2 = para2;
	}

}
