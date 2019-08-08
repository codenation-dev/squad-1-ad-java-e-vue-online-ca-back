<template>
  <v-container text-center>
    <h1 class="register__title text-center">Cadastro</h1>
    <v-form @submit.prevent="handleSubmit">
      <v-flex xs12 offset-md4 md4>
        <v-text-field required label="E-mail" outlined />
        <v-text-field required label="Senha" outlined type="password" />
        <v-btn color="success" block type="submit">Cadastrar</v-btn>
      </v-flex>
    </v-form>
  </v-container>
</template>

<script>
export default {
  name: 'register',
  data: () => ({
    //
  }),
  methods: {
    handleSubmit() {
      alert('Chama a rota para criar registrar o usuário');
    }
  }
};
</script>

<style lang="scss" scoped>
.register__title {
  margin: 5rem 0 2rem;
}
</style>
