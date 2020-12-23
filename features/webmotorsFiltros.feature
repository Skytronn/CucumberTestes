# language: pt

	Funcionalidade: Filtros na busca
	#Este teste as vezes roda, outras vezes apresenta erro de time out no site. Fica intermitente se executado
	#Algumas vezes
	
	#Quando executado junto com outros testes tem grande chance de "bugar" e não achar os campos por causa da demora do site
	#Se não funcionar pode executar só esta evidencia que funciona certinho
	@evidencia
	Cenario: Validacao se os filtros estão funcionando
	Dado que eu navego até a página do webmotors
	Quando eu clico no botão ver ofertas
	E espera um pouco
	Entao o sistema filtra os produtos

	
	