package br.com.ipbcentralbetim.predestinado.busines;

import br.com.ipbcentralbetim.predestinado.models.Membro;
import br.com.ipbcentralbetim.predestinado.repository.MembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MembroService {
    @Autowired
    private MembroRepository membroRepository;

    public Membro salvar(Membro membro) {
        membroRepository.save(membro);
        return membro;
    }

    public Membro atualiza(Membro membro) {
        membroRepository.save(membro);
        return membro;
    }

    public void excluir(Integer id) {
        membroRepository.deleteById(id);
    }

    public Membro consultar(Integer id) {
        return membroRepository.findById(id).get();
    }
}
