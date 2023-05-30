package musicDTO;

public class musicDTO {
	
	private String name;
	private String singer;
	private String musicPath;
	
	
	
	
	public musicDTO(String name, String singer, String musicPath) {
		this.name = name;
		this.singer = singer;
		this.musicPath = musicPath;
	}
	
	public String getName() {
		return name;
	}
	public String getSinger() {
		return singer;
	}
	public String getMusicPath() {
		return musicPath;
	}

}
