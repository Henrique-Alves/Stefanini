#language:pt



Funcionalidade: Cadastrar Usuário

   Eu como usuário do sistema.
   Desejo realizar o cadastro de novos usuários.
   Para que seja possível armazenar e gerenciar seus dados.

Cenário: enviar cadastro sem email.

		Dado que inserir nome sobrenome do usário.
		E senha do usuário.
		E clicar no botão cadastra.
		Então O sistema exibe a mensagem: O campo email é obrigatório.
