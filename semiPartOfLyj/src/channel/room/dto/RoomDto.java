package channel.room.dto;

import java.util.Date;

// 채널의 정보를 전달해주는 DTO

public class RoomDto {

	private int channel_num;
	private String channel_name;
	private String channel_information;
	private String channel_master;
	private String channel_access;
	private String channel_enabled;
	private Date channel_regdate;
	
	public RoomDto() {
		
	}
	
	public RoomDto(int channel_num, String channel_name, String channel_information, String channel_master,
			String channel_access, String channel_enabled, Date channel_regdate) {
		this.channel_num = channel_num;
		this.channel_name = channel_name;
		this.channel_information = channel_information;
		this.channel_master = channel_master;
		this.channel_access = channel_access;
		this.channel_enabled = channel_enabled;
		this.channel_regdate = channel_regdate;
	}

	public int getChannel_num() {
		return channel_num;
	}

	public void setChannel_num(int channel_num) {
		this.channel_num = channel_num;
	}

	public String getChannel_name() {
		return channel_name;
	}

	public void setChannel_name(String channel_name) {
		this.channel_name = channel_name;
	}

	public String getChannel_information() {
		return channel_information;
	}

	public void setChannel_information(String channel_information) {
		this.channel_information = channel_information;
	}

	public String getChannel_master() {
		return channel_master;
	}

	public void setChannel_master(String channel_master) {
		this.channel_master = channel_master;
	}

	public String getChannel_access() {
		return channel_access;
	}

	public void setChannel_access(String channel_access) {
		this.channel_access = channel_access;
	}

	public String getChannel_enabled() {
		return channel_enabled;
	}

	public void setChannel_enabled(String channel_enabled) {
		this.channel_enabled = channel_enabled;
	}

	public Date getChannel_regdate() {
		return channel_regdate;
	}

	public void setChannel_regdate(Date channel_regdate) {
		this.channel_regdate = channel_regdate;
	}
	
	
}