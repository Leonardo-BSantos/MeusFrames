#Author: leo_h



Feature: Validar Login
  Eu como usuario quero validar meu login para acessar as funcionalidades do sistema

Background: Abrir tela de login

		Given que eu esteja na tela de login
		
		
  Scenario: Login com sucesso
    
    When preencher os campos de login
    Then login realizado com sucesso

       
    Scenario: Login de dados invalidos
    Given que eu esteja na tela de login
    When preencher o usuario
    But preencher a senha invalida
    Then login nao sera realizado