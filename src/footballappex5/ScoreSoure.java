/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballappex5;

import java.util.ArrayList;

/**
 *
 * @author keepa
 */
public class ScoreSoure {
        	private ArrayList<ScoreListener> listeners;
	public ScoreSoure() {
		listeners = new ArrayList<>();
	}
	public void setScoreLine(String val) {
		fireScore(new ScoreEvent(this, val));
	}

	public void addSubscriber(ScoreListener l) {
		listeners.add(l);
	}
	public void removeSubscriber(ScoreListener l) {
		listeners.remove(l);
	}
	public void fireScore(ScoreEvent e) {
      for(int i = 0; i < listeners.size(); i++) {
			ScoreListener l = listeners.get(i);
			l.scoreChange(e);
		}
	}
}
