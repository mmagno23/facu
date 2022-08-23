@echo off


echo Terminal de controle


:inicio
set /p opcao= informe um numero ou help para os comandos:
if %opcao% == type (goto:type)
if %opcao% == start (goto:start)
if %opcao% == ren (goto:ren)
if %opcao% == date (goto:date)
if %opcao% == dir (goto:dir)
if %opcao% == versao (goto:versao)
if %opcao% == help (goto:help)

:help
echo type - criar um aquivo
echo start - abrir aquivo
echo ren - renomear arquivo
echo date - trocar a data
echo dir - local do arquivo
echo versao - versao

goto:inicio

:type
echo criando arquivo
type nul> novo.txt
goto:inicio


:start
echo abrindo aquivo
start novo.txt
goto:inicio


:ren
echo renomeando arquivo
ren novo.txt arquivoNovo.txt
goto:inicio


:date
echo trocar data
date
date /t
goto:inicio

:dir
local do arquivo
dir
goto:inicio


:versao
echo versao 0.0.1
goto:inicio











pause
