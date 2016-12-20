
public class Anime {
	private String titleOfShow;
	private String genre;
	private String producer;
	private String startDate;
	private String finalEpisodeDate;
	
	public Anime(String titleOfShow, String genre, String producer, String startDate, String finalEpisodeDate) {
		super();
		this.titleOfShow = titleOfShow;
		this.genre = genre;
		this.producer = producer;
		this.startDate = startDate;
		this.finalEpisodeDate = finalEpisodeDate;
	}

	public String getTitleOfShow() {
		return titleOfShow;
	}

	public void setTitleOfShow(String titleOfShow) {
		this.titleOfShow = titleOfShow;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getFinalEpisodeDate() {
		return finalEpisodeDate;
	}

	public void setFinalEpisodeDate(String finalEpisodeDate) {
		this.finalEpisodeDate = finalEpisodeDate;
	}
	
	
	

}
