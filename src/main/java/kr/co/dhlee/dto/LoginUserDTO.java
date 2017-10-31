package kr.co.dhlee.dto;

import java.io.Serializable;
import java.util.List;

import java.util.Date;

/**
* vo generate test
*
*/
public class LoginUserDTO  implements Serializable
{
	private static final long serialVersionID = 1L;
	/**
	* <p>Integer type</p>
	*/
	private int id;
	/**
	* <p>string type</p>
	*/
	private String name;
	/**
	* <p>java type</p>
	*/
	private List<Address> address;
	
	public static class Address
	{
		/**
    	* <p>inner String type</p>
    	*/
    	private String addr;
   	 /**
		* <p>2 level inner java type</p>
		*/
    	private List<ZipUnit> zipcode;
	
    	public static class ZipUnit
    	{
    		/**
        	* <p>String type</p>
        	*/
        	private String prefix;
    		/**
        	* <p>String type</p>
        	*/
        	private String suffix;
	
        	public String getPrefix()
        	{
    			return prefix;
        	}
    		public void setPrefix( String prefix )
    		{
    	    	this.prefix = prefix;
        	}
        	public String getSuffix()
        	{
    			return suffix;
        	}
    		public void setSuffix( String suffix )
    		{
    	    	this.suffix = suffix;
        	}
    	}
	
    	public String getAddr()
    	{
			return addr;
    	}
		public void setAddr( String addr )
		{
	    	this.addr = addr;
    	}
    	public List<ZipUnit> getZipcode()
		{
			return zipcode;
		}
		public void setZipcode( List<ZipUnit> zipcode )
		{
			this.zipcode = zipcode;
		}
	}
	

	public int getId()
	{
		return id;
	}
	public void setId( int id )
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName( String name )
	{
		this.name = name;
	}
	public List<Address> getAddress()
	{
		return address;
	}
	public void setAddress( List<Address> address )
	{
		this.address = address;
	}
}
