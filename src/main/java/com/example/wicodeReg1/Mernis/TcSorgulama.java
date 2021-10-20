package com.example.wicodeReg1.Mernis;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class TcSorgulama {
	
	private long tc;
	private String isim;
	private String soyisim;
	private int dogumyili;
	public KPSPublicSoapProxy kps;
	
	public TcSorgulama(long tc, String isim, String soyisim, int dogumyili) {
		super();
		this.tc = tc;
		this.isim = isim;
		this.soyisim = soyisim;
		this.dogumyili = dogumyili;
		kps=new KPSPublicSoapProxy();
	}
	
	public boolean TcSorgula() throws RemoteException {
		//KPSPublicSoapProxy kps=new KPSPublicSoapProxy();
		boolean result=kps.TCKimlikNoDogrula(tc, isim, soyisim, dogumyili);
		if(result==true) {
			return true;
		}else {
			return false;
		}
	}
	
	

}
