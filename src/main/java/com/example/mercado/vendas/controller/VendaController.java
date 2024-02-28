package com.example.mercado.vendas.controller;

import com.example.mercado.vendas.controller.request.AdicionarPagamentoRequest;
import com.example.mercado.vendas.controller.request.ProdutosIdRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v0/vendas")
public class VendaController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void iniciarVenda(
            @RequestBody ProdutosIdRequest produtosIdRequest){
        System.out.println("Iniciar Venda");
    }
    @PostMapping("/{idVenda}/produtos")
    public void adicionarProdutosVenda(
            @PathVariable("idVenda") Long idVenda,
            @RequestBody ProdutosIdRequest produtosIdRequest){
        System.out.println("Adicionar Produtos a Venda");
    }

    @DeleteMapping("/{idVenda}/produtos")
    public void removerProdutosDeVenda(
            @PathVariable("idVenda") Long idVenda,
            @RequestBody ProdutosIdRequest produtosIdRequest){
        System.out.println("Remover Produtos a Venda");
    }
    @PostMapping("/{idVenda}/pagamentos")
    public void adicionarPagamento(
            @PathVariable("idVenda") Long idVenda,
            @RequestBody AdicionarPagamentoRequest adicionarPagamentoRequest
    ){
        System.out.println("Adicionar Pagamentos a venda");
    }
    @PostMapping("/{idVenda}/finalizar")
    public void finalizarVenda(
            @PathVariable("idVenda") Long idVenda
    ){
        System.out.println("Finalizar Venda");
    }
}


