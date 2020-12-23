# language: pt

	Funcionalidade: Verificar se o botão de ofertas funciona
			
	@evidencia
	Cenario: Validar botão ver ofertas
	Dado que eu navego até a página do webmotors
	Quando eu clico no botão ver ofertas
	Entao eu sou direcionado a página de ofertas
	
	@evidencia
	Cenario: Validar campo de busca
	Dado que eu navego até a página do webmotors
	E eu digito na barra de busca
	Quando eu clico no botão ver ofertas
	Então eu sou direcionado a página seguinte
	
