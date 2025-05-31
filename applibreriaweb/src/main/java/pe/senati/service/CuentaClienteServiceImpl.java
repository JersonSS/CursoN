package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.CuentaCliente;
import pe.senati.repository.CuentaClienteRepository;

@Service
public class CuentaClienteServiceImpl implements CuentaClienteService
{

    public CuentaClienteServiceImpl() {}

    @Autowired
    private CuentaClienteRepository repository;


    @Override
    @Transactional
    public void insert(CuentaCliente cuentaCliente) {
        repository.save(cuentaCliente);
    }

    @Override
    @Transactional
    public void update(CuentaCliente cuentaCliente) {
        repository.save(cuentaCliente);
    }

    @Override
    @Transactional
    public void delete(Integer cuentaCliente_id) {
        repository.deleteById(cuentaCliente_id);
    }

    @Override
    @Transactional(readOnly = true)
    public CuentaCliente findById(Integer cuentaCliente_id) {    
        return repository.findById(cuentaCliente_id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public Collection<CuentaCliente> findAll() {
        return repository.findAll();
    }

    @Override
    public int isDelete(Integer cuenta_cliente_id) {
        return repository.isDelete(cuenta_cliente_id);
    }
   
}