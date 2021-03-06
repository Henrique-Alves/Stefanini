#language:pt



Funcionalidade: Cadastrar Usuário

   Eu como usuário do sistema.
   Desejo realizar o cadastro de novos usuários.
   Para que seja possível armazenar e gerenciar seus dados.
   

#Cenário: enviar cadastro sem nome.
#
#		Dado que inserir email do usário.
#		E senha do usuário.
#		E clicar no botão cadastra.
#		Então O sistema exibe a mensagem: O campo Nome é obrigatório.
		
#Cenário: enviar cadastro sem senha.
#
#		Dado que inserir nome sobrenome do usário.
#		E email do usuário.
#		E clicar no botão cadastra.
#		Então O sistema exibe a mensagem: O campo Senha é obrigatório.
#		
#Cenário: validar o enviar do cadastro do usuário com campos vazios.
#
    #Dado que clicar no botão cadastrar sem ter inserido os dados do usuário.
    #Então o sistema exibe as mensagens: O campo Nome é obrigatório, 
    #O campo email é obrigatório e O campo Senha é obrigatório.
    #
#Cenário: enviar cadastro com primeiro nome.
#
#		Dado que inserir o primeiro nome do usário.
#		E email do usuário.
#		E senha do usuário.
#		Quando clicar no botão [Cadastrar].
#		Então O sistema exibe a mensagem: Por favor, insira um nome completo.
#		
#Cenário: validar email valido.
#
#		Dado que inserir nome sobrenome do usário.
#		E inserir email invalido.
#		E senha do usuário.
#		E clicar no botão cadastra.
#		Então o sistema exibe a mensagem: Por favor, insira um e-mail válido.
#		
#		
#Cenário: Validar senha com menos de oito caracteres.
#
    #Dado que inserir nome sobrenome do usário.
#		E inserir email.
#		E senha com menos de oito caracteres do usuário.
#		E clicar no botão cadastra.
#		Então o sistema exibe a mensagem: A senha deve conter ao menos 8 caracteres.
    
    