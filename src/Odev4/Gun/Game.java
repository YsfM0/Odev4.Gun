package Odev4.Gun;

public class Game {
	private int gameId;
	private String gameName;
	private String gameDetail;
	private double price;

	public Game(int gameId, String gameName, String gameDetail, double price) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gameDetail = gameDetail;
		this.price = price;

	}
	public Game() {}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameDetail() {
		return gameDetail;
	}

	public void setGameDetail(String gameDetail) {
		this.gameDetail = gameDetail;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
