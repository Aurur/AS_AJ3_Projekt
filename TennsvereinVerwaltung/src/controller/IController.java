package controller;
/**
 * FA21
 * @version 1.0 vom 17.09.2014
 * @author Andreas Lau, Vivian Fuhl
 */

import java.util.Date;
import java.util.List;

import repository.Game;
import repository.Member;

public interface IController {
	public boolean createMember(String lastname, String firstname);
	public String[][] getListOfMembers();
	public boolean createGame(Date date, Member memberOne, Member memberTwo);
	public String[][] getListOfGames(Member member);
}
