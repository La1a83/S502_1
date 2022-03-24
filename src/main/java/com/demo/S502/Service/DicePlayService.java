package com.demo.S502.Service;


import java.util.List;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.demo.S502.dto.PlayerResponseDto;
import com.demo.S502.dto.RoundResponseDto;

public interface DicePlayService {
	
	
	public List <PlayerResponseDto> getAll();
	public PlayerResponseDto findById (int id);
	public PlayerResponseDto addPlayer(PlayerResponseDto player);
	public void updateName (PlayerResponseDto player);
	public RoundResponseDto newRound (int id);
	public void deleteRoundsById(int id);
	public void deletePlayer (int id);
	public void deleteAllRoundsByPlayerId(int id);
	public List<RoundResponseDto> getAllRoundsByIdPlayer(int id);
	public TreeMap<Double, String>  rankingSuccess();
	public PlayerResponseDto findLoser();
	public PlayerResponseDto findWinner();
	
}
