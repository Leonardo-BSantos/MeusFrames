#Author: leo_h

  @tag2
  Scenario Outline: Validar login de usuario
    Given que eu esteja na tela de login
    When preencher os campos de <username>
    And preencher o campo <password>
    Then autenticacao <status>

    Examples: 
      | username  | password      | status  |
      | "Admin"   |    "admin123" | true    |
      | "Admin"   |    "@123"     | false   |
      |           |               | false   |