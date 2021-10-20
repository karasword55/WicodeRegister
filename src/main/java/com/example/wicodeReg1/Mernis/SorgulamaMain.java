package com.example.wicodeReg1.Mernis;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class SorgulamaMain {
	
	public static void main(String[] args) {
		
		
		
		
	}
	
	public  boolean TcSorgulamaMain(long tc,String isim,String soyisim,int dogumYili) {
		KPSPublicSoapProxy kps=new KPSPublicSoapProxy();
		boolean sonuc;
		try {
			sonuc=kps.TCKimlikNoDogrula(tc, isim, soyisim, dogumYili);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(sonuc=true) {
			return true;
		}else {
			return false;
		}
	}

}
