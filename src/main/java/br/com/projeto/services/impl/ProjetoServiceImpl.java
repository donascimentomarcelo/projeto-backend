package br.com.projeto.services.impl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.projeto.dto.ContentReg;
import br.com.projeto.dto.Dto;
import br.com.projeto.dto.FieldsForm;
import br.com.projeto.dto.FormDto;
import br.com.projeto.services.ProjetoService;

@Service
public class ProjetoServiceImpl implements ProjetoService {
	
	private static final String URL = "http://hechoparaliderar.com/SIAF/api/php/proxys/regsproxy.php";

	@Override
	public Dto formatDto(FormDto form) {
		List<FieldsForm> list = new ArrayList<>();
        Class<? extends Object> c = form.getClass();
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();            
            try {
            	FieldsForm fieldsForm = new FieldsForm("TEXT", "fieldType1_combo", name, field.get(form).toString(), "NameCharactersAndNumbers");
            	list.add(fieldsForm);
            } catch (IllegalArgumentException e) {
              e.printStackTrace();
            } catch (IllegalAccessException e) {
              e.printStackTrace();
            }
        }
        
        ContentReg contentReg = new ContentReg(988, 36, "prueba (988)", "prueba", list, new Date());
		Dto dto = new Dto(1, 988, 36, contentReg, new Date());
		
		return dto;
	}

	@Override
	public void sendToEndpoint(Dto dto) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Dto> request = new HttpEntity<Dto>(dto, headers);
		RestTemplate restTemplate = new RestTemplate();
    	
        ResponseEntity<Dto> response = null;
        try {
            response = restTemplate.exchange(URL, HttpMethod.POST, request, Dto.class);
        } catch (Exception e) {
        	System.out.println(e);
        }
	}

}
