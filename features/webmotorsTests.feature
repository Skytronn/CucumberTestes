# language: pt

	Funcionalidade: Testar pagina de cadastro do Webmotors e verifica se vai para paragina home
	
		Um cliente deseja fazer cadastro no site
		
	@evidencia
	Cenario: Validar se o usuário faz cadastro
	Dado que eu navego até a página de Cadastro do webmotors
	Quando eu preencho os meus dados de cadastro
	E clico no botão criar conta
	Entao eu estou cadastrado
		
	@evidencia
	Cenario: Validar botão ver ofertas
	Dado que eu navego até a página do webmotors
	Quando eu clico no botão ver ofertas
	Entao eu sou direcionado a página de ofertas

		