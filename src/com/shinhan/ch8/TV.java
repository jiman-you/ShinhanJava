package com.shinhan.ch8;

public class TV implements Volume{
	private int VolLevel;
	@Override
	public void volumeUp(int Level) {
		// TODO Auto-generated method stub
		int vol = this.getVolLevel();
		vol+= Level;
		this.setVolLevel(vol);
		System.out.println(getClass().getSimpleName()+"볼륨 올립니다."+vol);
	}

	@Override
	public void volumeDown(int Level) {
		// TODO Auto-generated method stub
		int vol = this.getVolLevel();
		vol-= Level;
		if(vol<0)
			vol = 0;

		this.setVolLevel(vol);
		System.out.println(getClass().getSimpleName()+"볼륨 내립니다."+vol);
	}

	public int getVolLevel() {
		return VolLevel;
	}

	public void setVolLevel(int volLevel) {
		VolLevel = volLevel;
	}

}
