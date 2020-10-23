insert into cliente
(id,nome,email,telefone,cpf,rg,senha) values
(null,'Matheus','matheus@simplify.com','11963758133','76438728734','998777662','senhaForte'),
(null,'Jairo','jairo@simplify.com','11962258109','78338721093','945547452','senha'),
(null,'Pedro Henrique','p.henrique@simplify.com','11987638100','83438720083','998828600','piada'),
(null,'Leonardo','leonardo@simplify.com','11987987635','76983727438','998023875','packer'),
(null,'Carina','carina@simplify.com','11999736273','76438728734','998930123','safra'),
(null,'Eduarda','eduarda@simplify.com','11983923489','76438098345','909235847','parmera');

insert into endereco
(id,cep,cidade,estado,logradouro,cliente_id) values
(null,'1000000','São Paulo','SP','Av Paulista',1),
(null,'2093894','São Paulo','SP','Av São Miguel',2),
(null,'3902093','São Paulo','SP','Radial Leste',3),
(null,'0949304','São Paulo','SP','Av Europa',4),
(null,'8498539','São Paulo','SP','Av Brasil',5),
(null,'3234854','São Paulo','SP','Av Imperador',6);

insert into solicitacao
(id, Descricao,Online, Presencial, endereco_id) values
(null,'Certidão de Nascimento ', 'sim', 'não',1),
(null,'Certidão de Casamento ', 'sim', 'não',1),
(null,'Compra de imóveis', 'não' ,'sim',2),
(null,'Certidão de Nascimento ', 'sim', 'não',3),
(null,'Certidão de Casamento ', 'sim', 'não',4),
(null,'Certidão de Nascimento ', 'sim', 'não',5),
(null,'Compra de imóveis', 'não', 'sim',6);