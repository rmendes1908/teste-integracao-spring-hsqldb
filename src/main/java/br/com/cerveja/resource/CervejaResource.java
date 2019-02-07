package br.com.cerveja.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cerveja.modelo.Cerveja;
import br.com.cerveja.repository.CervejaRepository;

@RestController
@RequestMapping("/api/cervejas")
public class CervejaResource {
	
	private CervejaRepository cervejaRepository;
	
	public CervejaResource(CervejaRepository cervejaRepository) {
		this.cervejaRepository = cervejaRepository;
	}

	@GetMapping()
	public List<Cerveja> listar(){
		return cervejaRepository.findAll();
	}
	
	@PostMapping()
	public Cerveja nova(@RequestBody Cerveja cerveja) {
		return cervejaRepository.save(cerveja);
	}
	
}
