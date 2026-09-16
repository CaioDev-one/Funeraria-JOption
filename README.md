# ⚰️ Sistema de Gestão Funerária (CLI / JOptionPane)

Sistema em **Java** desenvolvido com foco na lógica de backend/terminal e interações gráficas simples via `JOptionPane`. O projeto simula o fluxo de atendimento de uma funerária, contemplando cadastro de usuário, autenticação, catálogo de produtos (com carrinho de compras) e simulação de formas de pagamento com regras de negócio personalizadas (descontos e parcelamentos com/sem juros).

---

## 🚀 Tecnologias Utilizadas
* **Linguagem:** Java (JDK 11 ou superior recomendado)
* **Interface gráfica/I/O:** `javax.swing.JOptionPane` (Caixas de diálogo nativas do Java)

---

## 📋 Funcionalidades do Sistema

1. **Autenticação e Cadastro de Usuário:**
   * Identificação do cliente pelo nome.
   * Opção de primeiro acesso para cadastro de senha (com validação de confirmação e opções de redefinição).
   * Tela de login para clientes já cadastrados.

2. **Catálogo de Produtos e Carrinho:**
   * Listagem de opções de itens funerários (Coroa de flores e diferentes tipos de caixões: Básico, Padrão e Luxo).
   * Acumulador de quantidade de itens e valor total da compra.
   * Opção de continuar comprando ou finalizar o pedido.

3. **Módulo de Pagamento:**
   * **Opção 1:** Pagamento à vista com 10% de desconto.
   * **Opção 2:** Parcelamento em até 15x sem juros (com validação de valor mínimo por parcela de R$ 250,00).
   * **Opção 3:** Parcelamento em até 37x com juros (aplicação de 20% de acréscimo e validação de valor mínimo por parcela de R$ 100,00).

---

## 🛠️ Como Executar o Projeto Localmente

Certifique-se de ter o **Java Development Kit (JDK)** instalado em sua máquina.

1. Clone o repositório:
   ```bash
   git clone [https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git](https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git)
