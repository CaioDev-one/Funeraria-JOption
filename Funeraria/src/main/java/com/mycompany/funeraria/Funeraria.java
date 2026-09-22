/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.funeraria;

import javax.swing.JOptionPane;

/**
 *
 * @author caioc
 */
public class Funeraria {

    public static void main(String[] args) {
        String nome;
        int opcao = 0;
        int senha = 0;
        int senhatentativa = 0;
        int opcaoRedefinir = 0;
        boolean cadastroConcluido = false;
        boolean confirmouCorreto = false;

        nome = JOptionPane.showInputDialog("Digite seu nome:");
        opcao = JOptionPane.showConfirmDialog(null, "Seria o seu primeiro acesso Sr " + nome + "");

        if (opcao == 0) {
            cadastroConcluido = false;

            while (!cadastroConcluido) {
                senha = Integer.parseInt(JOptionPane.showInputDialog("Cadastre uma senha de até 8 números:"));

                JOptionPane.showMessageDialog(null, "Senha cadastrada com sucesso:");

                while (!confirmouCorreto) {
                    senhatentativa = Integer.parseInt(JOptionPane.showInputDialog("Digite novamente sua senha para confirmar!"));

                    if (senhatentativa == senha) {
                        JOptionPane.showMessageDialog(null, "Logado com sucesso! acesse nossos produtos!");
                        confirmouCorreto = true;
                        cadastroConcluido = true;
                        telaProdutos(nome);
                    } else {
                        opcaoRedefinir = Integer.parseInt(JOptionPane.showInputDialog("Deseja tentar novamente[1] ou redefinir a senha[2]?"));

                        if (opcaoRedefinir == 1) {
                            JOptionPane.showMessageDialog(null, "Ok, vamos tentar digitar a senha e a confirmação de novo.");
                        } else if (opcaoRedefinir == 2) {
                            JOptionPane.showMessageDialog(null, "Reiniciando o cadastro da senha...");
                            break;
                        }
                    }
                }
            }
        } else if (opcao == 1) {
            JOptionPane.showInputDialog("Digite sua senha:");
            JOptionPane.showMessageDialog(null, "Logado com sucesso! acesse nossos produtos!");
            telaProdutos(nome);
        }
    }

    public static void telaProdutos(String nome) {
        int opcaoProduto = 0;
        int carrinho = 0;
        double totalCompra = 0;
        int opcaoNovamente = 1;

        while (opcaoNovamente == 1) {
            opcaoProduto = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                        
                    =========== NOSSOS PRODUTOS ===========    
                    Seja bem vindo senhor: %s 
                    [1]Coroa de flores_____________R$250
                    [2]Caixão básico_____________R$250                                                                                                                                                 
                    [3]Caixão Padrão_____________R$250                                  
                    [4]Caixão Luxo_____________R$250                                  
                    
                    """.formatted(nome)));

            switch (opcaoProduto) {
                case 1: {
                    totalCompra = totalCompra + 250;
                    carrinho = carrinho + 1;

                    JOptionPane.showMessageDialog(null, "Total da compra: R$ " + totalCompra + "");
                    JOptionPane.showMessageDialog(null, "Quantidade: " + carrinho + "");

                    JOptionPane.showMessageDialog(null, """
                    =========== CARRINHO DE COMPRA ===========                                     
                    Produto escolhido Coroa de flores no valor de 250 reais
                    Total da compra R$: %.2f                                                                                                 
                                                                     
                                                                     """.formatted(totalCompra));
                    break;
                }

                case 2: {
                    totalCompra = totalCompra + 1000;
                    carrinho = carrinho + 1;

                    JOptionPane.showMessageDialog(null, "Total da compra: R$ " + totalCompra + "");
                    JOptionPane.showMessageDialog(null, "Quantidade: " + carrinho + "");

                    JOptionPane.showMessageDialog(null, """
                    =========== CARRINHO DE COMPRA ===========                                     
                    Produto escolhido Caixão Básico no valor de 1000 reais
                    Total da compra R$: %.2f                                                                                                 
                                                                     
                                                                     """.formatted(totalCompra));
                    break;
                }

                case 3: {
                    totalCompra = totalCompra + 1500;
                    carrinho = carrinho + 1;

                    JOptionPane.showMessageDialog(null, "Total da compra: R$ " + totalCompra + "");
                    JOptionPane.showMessageDialog(null, "Quantidade: " + carrinho + "");

                    JOptionPane.showMessageDialog(null, """
                    =========== CARRINHO DE COMPRA ===========                                     
                    Produto escolhido Caixão padrão no valor de 1500 reais
                    Total da compra R$: %.2f                                                                                                 
                    ==========================================                                      
                                                                     """.formatted(totalCompra));

                    break;
                }
                case 4: {
                    totalCompra = totalCompra + 2500;
                    carrinho = carrinho + 1;

                    JOptionPane.showMessageDialog(null, "Total da compra: R$ " + totalCompra + "");
                    JOptionPane.showMessageDialog(null, "Quantidade: " + carrinho + "");

                    JOptionPane.showMessageDialog(null, """
                    =========== CARRINHO DE COMPRA ===========                                     
                    Produto escolhido Caixão luxo no valor de 2500 reais
                    Total da compra R$: %.2f                                                                                                 
                                                                     
                                                                     """.formatted(totalCompra));

                    break;
                }

                default: {
                    JOptionPane.showMessageDialog(null, "Opção Inválida tente novamente!");
                    break;
                }
            }

            opcaoNovamente = -1;
            while (opcaoNovamente != 1 && opcaoNovamente != 0) {
                opcaoNovamente = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja comprar outro produto? [1]Sim [0]Não"));

                if (opcaoNovamente != 1 && opcaoNovamente != 0) {
                    JOptionPane.showMessageDialog(null, "Digite apenas 1 ou 0!!");
                } else if (opcaoNovamente == 0) {
                    JOptionPane.showMessageDialog(null, "Compra finalizada, redirecionando para o pagamento!!");
                    telaPagamento(totalCompra);
                }
            }
        }
    }

    public static void telaPagamento(double totalRecebido) {
        int opcaoPagamento = 0;
        double descontoValor = 0;
        double descontoTotal = 0;
        boolean desconto = false;

        opcaoPagamento = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                      
          ========== TOTAL E PAGAMENTO ==========
          Total Compra: %.2f
          [1] A Vista com 10%% de Desconto
          [2] Parcelado em até 15x vezes sem juros
          [3] Parcelado em até 37x vezes com juros
                                                                      
                                                                      """.formatted(totalRecebido)));

        switch (opcaoPagamento) {
            case 1: {
                descontoValor = totalRecebido * 0.10;
                descontoTotal = totalRecebido - descontoValor;

                JOptionPane.showMessageDialog(null, """
                                                    
                    Opção escolhida: %d 
                    Valor para pagamento a vista de: %.2f
                    Desconto de: %.2f
                                                    
                                                    """.formatted(opcaoPagamento, descontoTotal, descontoValor));
                desconto = true;
                break;
            }

            case 2: {
                int numeroParcelas = Integer.parseInt(JOptionPane.showInputDialog("Deseja parcelar em quantas vezes?"));

                if (numeroParcelas < 1 || numeroParcelas > 15) {
                    JOptionPane.showMessageDialog(null, "Opções de parcelas inválidas!!");
                } else {
                    double valorParcela = totalRecebido / numeroParcelas;

                    if (valorParcela < 250) {
                        JOptionPane.showMessageDialog(null, """
                            
                            Não é possivel parcelas em: %d vezes
                            O valor da parcela (R$ %.2f) é menor  que o mínimo de 250 reais.                                                                                        
                                                                """.formatted(numeroParcelas, valorParcela));
                    } else {
                        JOptionPane.showMessageDialog(null, """
                            
                          Opcção escolhida: %d
                          Quantidade de parcela: %dx
                          Valor de cada parcela: %.2f
                          Total a pagar: %.2f
                            
                            """.formatted(opcaoPagamento, numeroParcelas, valorParcela, totalRecebido));
                    }
                }
                break;
            }
            case 3: {
                double totalJuros = totalRecebido * 1.20;

                int parcelas = Integer.parseInt(JOptionPane.showInputDialog("Deseja parcelas em quantas vezes?"));

                if (parcelas < 1 || parcelas > 37) {
                    JOptionPane.showMessageDialog(null, "Opções de parcelas inválidas!!");
                } else {
                    double valorParcela = totalJuros / parcelas;

                    if (valorParcela < 100) {
                        JOptionPane.showMessageDialog(null, """
                            
                            Não é possivel parcelas em: %d vezes
                            O valor da parcela (R$ %.2f) é menor  que o mínimo de 100 reais.                                                                                        
                                                                """.formatted(parcelas, valorParcela));
                    } else {
                        JOptionPane.showMessageDialog(null, """
                                                              
                           Opcção escolhida: %d
                           Quantidade de parcela: %d
                           Valor de cada parcela: %.2f
                           Total a pagar: %.2f
                                                              
                                                              """.formatted(opcaoPagamento, parcelas, valorParcela, totalJuros));
                    }
                }

                break;
            }

            default: {
                JOptionPane.showMessageDialog(null, "Digite uma opção válida!");
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "Obrigado pela compra até mais!");
    }
}
