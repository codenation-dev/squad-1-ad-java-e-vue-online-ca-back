<template>
  <v-app>
    <v-app-bar app color="#2687e9" >
      <v-toolbar-title class="headline text-uppercase app-title">
        <span>Central de Erros</span>
      </v-toolbar-title>
      <v-spacer></v-spacer>
    </v-app-bar>
    <v-content>
      <router-view />
    </v-content>
    <v-footer>
      <v-container align-center>
        <v-text>Desenvolvido por Squad-1</v-text>
      </v-container>
    </v-footer>
  </v-app>
</template>

<style lang="scss" scoped>
.app-title {
  color: #fff;
}
</style>


<style>
/* http://meyerweb.com/eric/tools/css/reset/
   v2.0 | 20110126
   License: none (public domain)
*/

html, body, div, span, applet, object, iframe,
h1, h2, h3, h4, h5, h6, p, blockquote, pre,
a, abbr, acronym, address, big, cite, code,
del, dfn, em, img, ins, kbd, q, s, samp,
small, strike, strong, sub, sup, tt, var,
b, u, i, center,
dl, dt, dd, ol, ul, li,
fieldset, form, label, legend,
table, caption, tbody, tfoot, thead, tr, th, td,
article, aside, canvas, details, embed,
figure, figcaption, footer, header, hgroup,
menu, nav, output, ruby, section, summary,
time, mark, audio, video {
	margin: 0;
	padding: 0;
	border: 0;
	font-size: 100%;
	font: inherit;
	vertical-align: baseline;
}
/* HTML5 display-role reset for older browsers */
article, aside, details, figcaption, figure,
footer, header, hgroup, menu, nav, section {
	display: block;
}
body {
	line-height: 1;
  box-sizing: border-box;

}
ol, ul {
	list-style: none;
}
blockquote, q {
	quotes: none;
}
blockquote:before, blockquote:after,
q:before, q:after {
	content: '';
	content: none;
}
table {
	border-collapse: collapse;
	border-spacing: 0;
}

h1 {
  font-size: 32px;
}

h2 {
  font-size: 28px;
}

h3 {
  font-size: 24px;
}
</style>
