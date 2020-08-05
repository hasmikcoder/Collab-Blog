package org.launchcode.blog.Blogs;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Blog {
	
	@Id
	@GeneratedValue
	private long id;
	private String header;
	private String subheader;
	private String image;
	private String body;
	private Date timestamp;
	
	public Blog(){}
	
	public Blog(String header, String subheader, String image,String body, Date timestamp){
		this.header = header;
		this.subheader =subheader;
		this.image = image;
		this.body = body;
		this.timestamp = timestamp;
	}
	
	public long getId() {
		return id;
	}
	
	public String getHeader() {
		return header;
	}
	
	public String getBody() {
		return body;
	}
	
	public void setBody(String body) {
		this.body = body;
	}
	
	public void setHeader(String header) {
		this.header = header;
	}
	
	public String getSubheader() {
		return subheader;
	}
	
	public void setSubheader(String subheader) {
		this.subheader = subheader;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
