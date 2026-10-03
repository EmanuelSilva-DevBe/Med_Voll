alter table medicos alter column ativo type boolean using ativo <> 0;;

update medicos set ativo = true;