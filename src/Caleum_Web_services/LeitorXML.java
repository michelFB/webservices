package Caleum_Web_services;

import java.io.InputStream;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class LeitorXML {

	  @SuppressWarnings("unchecked")
	public List<Negociacao> carrega(InputStream inputStream) {
	    XStream stream = new XStream();
	    stream.alias("negociacao", Negociacao.class);
	    return (List<Negociacao>) stream.fromXML(inputStream);
	  }
	}