package musicDTO;

public class musicDTO {
	
	private String name;
	private String singer;
	private String musicPath;
	private String hint;
	
	
	
	
	public musicDTO(String name, String singer, String musicPath,String hint) {
		this.name = name;
		this.singer = singer;
		this.musicPath = musicPath;
		this.hint = hint;
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

	public String getHint() {
		return hint;
	}

}
