package com.demo.S502.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Rounds")
public class RoundResponseDto extends ResponseDto {
	
	
	static final int max = 6;
    static final int min = 1;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int dice1;
	private int dice2;
	private int sum;
	private boolean wins;
	@ManyToOne()
    @JsonIgnore
    @JoinColumn(name="player_id")
	private PlayerResponseDto player;
    
	
	
	//Getters and Setters
	
	
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getDice1() {
		return dice1;
	}
	public void setDice1() {
		this.dice1 = (int)(Math.random()*(max-min)+min);
	}
	public int getDice2() {
		return dice2;
	}
	public void setDice2() {
		this.dice2 = (int)(Math.random()*(max-min)+min);
	}
	public int getSum() {
		return sum;
	}
	public void setSum() {
		this.sum = this.dice1+this.dice2;
	}
	public boolean isWins() {
		return wins;
	}
	public void setWinsa() {
		if (this.sum==7) {
			this.wins = true;
		} else {
			this.wins = false;
		}
	}
	
	
	public PlayerResponseDto getPlayer() {
		return player;
	}
	public void setPlayer(PlayerResponseDto player) {
		this.player = player;
	}
	
	@Override
	public String toString() {
		return "RoundResponseDto [id=" + id + ", dice1=" + dice1 + ", dice2=" + dice2 + ", sum=" + sum + ", wins="
				+ wins + ", player=" + player + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
