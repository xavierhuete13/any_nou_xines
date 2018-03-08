import java.util.Scanner;

public class AnyNouXines {

	public static Scanner anynou = new Scanner(System.in);
	public static int num, any, mes, dia, hora, min;
	public static String dades;

	public static void donarValor(String valor) {
		int cont = 1;
		for (int i = 0; i < 5; i++) {
			valor = anynou.next();
			String[] datos = valor.split(" ");

			for (String item : datos) {
				num = Integer.parseInt(item);
				if (cont == 1) {
					any = num;
				}
				if (cont == 2) {
					mes = num;
				}
				if (cont == 3) {
					dia = num;
				}
				if (cont == 4) {
					hora = num;
				}
				if (cont == 5) {
					min = num;
				}
				cont++;
			}
		}
	}

	public static String element(int valor) {
		String element = "";
		int ultim = valor % 10;
		if (ultim == 0 || ultim == 1) {
			element = "METAL";
		} else {
			if (ultim == 2 || ultim == 3) {
				element = "AGUA";
			} else {
				if (ultim == 4 || ultim == 5) {
					element = "MADERA";
				} else {
					if (ultim == 6 || ultim == 7) {
						element = "FUEGO";
					} else {
						if (ultim == 8 || ultim == 9) {
							element = "TIERRA";
						}
					}
				}
			}
		}
		return element;
	}

	public static String animalAnual(int valor) {
		String animal = "";
		int any = valor % 12;
		switch (any) {
		case 0:
			animal = "MONO";
			break;
		case 1:
			animal = "GALLO";
			break;
		case 2:
			animal = "PERRO";
			break;
		case 3:
			animal = "CERDO";
			break;
		case 4:
			animal = "RATA";
			break;
		case 5:
			animal = "BUEY";
			break;
		case 6:
			animal = "TIGRE";
			break;
		case 7:
			animal = "CONEJO";
			break;
		case 8:
			animal = "DRAGON";
			break;
		case 9:
			animal = "SERPIENTE";
			break;
		case 10:
			animal = "CABALLO";
			break;
		case 11:
			animal = "CABRA";
			break;
		}
		return animal;
	}

	public static String animalIntern(int valor_mes, int valor_dia) {
		String animal = "";
		if (valor_mes == 1 && valor_dia >= 6 || valor_mes == 2 && valor_dia <= 3) {
			animal = "BUEY";
		} else {
			if (valor_mes == 2 && valor_dia >= 4 || valor_mes == 3 && valor_dia <= 5) {
				animal = "TIGRE";
			} else {
				if (valor_mes == 3 && valor_dia >= 6 || valor_mes == 4 && valor_dia <= 4) {
					animal = "CONEJO";
				} else {
					if (valor_mes == 4 && valor_dia >= 5 || valor_mes == 5 && valor_dia <= 4) {
						animal = "DRAGON";
					} else {
						if (valor_mes == 5 && valor_dia >= 5 || valor_mes == 6 && valor_dia <= 5) {
							animal = "SERPIENTE";
						} else {
							if (valor_mes == 6 && valor_dia >= 6 || valor_mes == 7 && valor_dia <= 6) {
								animal = "CABALLO";
							} else {
								if (valor_mes == 7 && valor_dia >= 7 || valor_mes == 8 && valor_dia <= 6) {
									animal = "CABRA";
								} else {
									if (valor_mes == 8 && valor_dia >= 7 || valor_mes == 9 && valor_dia <= 7) {
										animal = "MONO";
									} else {
										if (valor_mes == 9 && valor_dia >= 8 || valor_mes == 10 && valor_dia <= 7) {
											animal = "GALLO";
										} else {
											if (valor_mes == 10 && valor_dia >= 8 || valor_mes ==11 && valor_dia <= 6) {
												animal = "PERRO";
											} else {
												if (valor_mes == 11 && valor_dia >= 7 || valor_mes == 12 && valor_dia <= 6) {
													animal = "CERDO";
												} else {
													if (valor_mes == 12 && valor_dia >= 7 || valor_mes == 1 && valor_dia <= 5) {
														animal = "RATA";
													} 
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return animal;
	}

	public static String animalSecret(int valor_hora, int valor_min) {
		String animal = "";
		if (valor_hora == 1 || valor_hora == 2 && valor_min <= 59) {
			animal = "BUEY";
		} else {
			if (valor_hora == 3 || valor_hora == 4 && valor_min <= 59) {
				animal = "TIGRE";
			} else {
				if (valor_hora == 5 || valor_hora == 6 && valor_min <= 59) {
					animal = "CONEJO";
				} else {
					if (valor_hora == 7 || valor_hora == 8 && valor_min <= 59) {
						animal = "DRAGON";
					} else {
						if (valor_hora == 9 || valor_hora == 10 && valor_min <= 59) {
							animal = "SERPIENTE";
						} else {
							if (valor_hora == 11 || valor_hora == 12 && valor_min <= 59) {
								animal = "CABALLO";
							} else {
								if (valor_hora == 13 || valor_hora == 14 && valor_min <= 59) {
									animal = "CABRA";
								} else {
									if (valor_hora == 15 || valor_hora == 16 && valor_min <= 59) {
										animal = "MONO";
									} else {
										if (valor_hora == 17 || valor_hora == 18 && valor_min <= 59) {
											animal = "GALLO";
										} else {
											if (valor_hora == 19 || valor_hora == 20 && valor_min <= 59) {
												animal = "PERRO";
											} else {
												if (valor_hora == 21 || valor_hora == 22 && valor_min <= 59) {
													animal = "CERDO";
												} else {
													if (valor_hora == 23 || valor_hora == 24 && valor_min <= 59) {
														animal = "RATA";
													} 
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return animal;
	}

	public static void main(String[] args) {
		int casos;
		String Element, Anual, Intern, Secret;
		casos = anynou.nextInt();
		do {
			donarValor(dades);

			Element = element(any);
			System.out.println(Element);

			Anual = animalAnual(any);
			System.out.println(Anual);
			
			Intern = animalIntern(mes, dia);
			System.out.println(Intern);
			
			Secret = animalSecret(hora, min);
			System.out.println(Secret);
			
			casos--;
		} while (casos != 0);
	}
}