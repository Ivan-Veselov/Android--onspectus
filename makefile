all: conspectus.pdf example.pdf

conspectus.pdf: conspectus.tex code-format.tex 01-views/views.tex 02-layouts/layouts.tex 03-input-controls/input-controls.tex 04-logs/logs.tex 05-toasts/toasts.tex 06-context-menus/context-menus.tex  07-list-views/list-views.tex
	pdflatex conspectus.tex
	pdflatex conspectus.tex
	
example.pdf: example/examples.tex example/studio_example.png example/example.xml example/example.java
	pdflatex example/examples.tex
