#include <stdio.h>
#define MAXLINE 100
#define TABSBYSPACES 4

int getLine();
void copy(char to[], char from[]);

int main(){
	/* Module to highlight tabspaces
	 * by replacing them with underscores(_)
	 * 
	 * This can be used as a plugin in different IDEs
	 * or text-editors for esolangs like whitespaces.
	 */

	int noOfTabs;
	int lenLine;
	int lenFormat;
	char line[MAXLINE];
	char formatLine[MAXLINE];


	while(( lenLine = getLine(line)) > 0 ){
		copy(formatLine, line);
		printf("%s\n", formatLine);
	}
	
	return 0;
}

int getLine(char s[]){
	int c, i, tabs;
	
	i = tabs = 0;
	while((c = getchar()) != '\n'){
		s[i] = c;
		++i;
	}
	s[i] = '\0';
	return i;
}

void copy(char to[], char from[]){
	// copy after formatting
	int ptrFrom, ptrTo;

	ptrFrom = ptrTo = 0;
	while(from[ptrFrom] != '\0'){
		if(from[ptrFrom] == '\t'){
			for(int j=0; j < TABSBYSPACES; ++j){
				to[ptrTo] = '_';
				++ptrTo;
			}
		}else{
			to[ptrTo] = from[ptrFrom];
			++ptrTo;
		}
		++ptrFrom;
	}
	to[ptrTo] = '\0';
}
