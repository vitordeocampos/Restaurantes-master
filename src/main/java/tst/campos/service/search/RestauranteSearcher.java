package tst.campos.service.search;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tst.campos.model.RestauranteDocument;
import tst.campos.repository.RestauranteDocumentRepository;
import tst.campos.util.Searcher;

/**
 * Buscador especial para Restaurantes
 *
 * @author Vitor
 */
@Component
public class RestauranteSearcher implements Searcher<RestauranteDocument> {

	/**
	 * Repositório de Restaurante
	 */
	@Autowired
	private RestauranteDocumentRepository restauranteDocumentRepo;

	/**
	 * Busca uma lista de Restaurantes pelo critério e parâmetros passados
	 */
	@Override
	public List<RestauranteDocument> search(String name, Object... param) {
		if (name == null) {
			return null;
		} else if (name.equals("nomeParcialSemCaixa") && param != null && param.length > 0) {
			return nomeParcialSemCaixa(String.valueOf(param[0]));
		}
		return null;
	}

	/**
	 * Busca um Restaurante pelo critério e parâmetros passados
	 */
	@Override
	public RestauranteDocument searchOne(String name, Object... param) {
		return null;
	}

	/**
	 * Busca uma lista de Restaurantes pelo nome
	 *
	 * @param param Nome
	 * @return Restaurantes encontrados
	 */
	public List<RestauranteDocument> nomeParcialSemCaixa(String param) {
		return restauranteDocumentRepo.findByNomeRegexIgnoreCase(param);
	}
}
