<template>
  <v-container text-center>
    <h1 class="register__title text-center">Cadastro</h1>
    <v-form v-model="isValid" @submit.prevent="handleSubmit">
      <v-flex xs12 offset-md4 md4>
        <v-text-field required v-model="name" :rules="nameRules" label="Nome" />
        <v-text-field required v-model="email" :rules="emailRules" label="E-mail" />
        <v-text-field required v-model="password" :rules="passwordRules" label="Senha" type="password" />
        <v-btn color="success" :disabled="!isValid" block type="submit">Cadastrar</v-btn>
      </v-flex>
    </v-form>
  </v-container>
</template>

<script>
export default {
  name: 'register',
  data: () => ({
    isValid: true,
    name: '',
    email: '',
    password: '',
    // Rules
    nameRules: [
      v => !!v || 'O nome é obrigatório',
      v => (v && v.length >= 3) || 'O nome deve ter mais do que 3 caracteres',
    ],
    emailRule: [
      v => !!v || 'O e-mail é obrigatório',
      v => /.+@.+\..+/.test(v) || 'Você deve informar um e-mail válido',
    ],
    passwordRules: [
      v => !!v || 'A senha é obrigatória',
      v => (v && v.length >= 6) || 'A senha deve ter no mínimo 6 caracteres',
      v => /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{6,}$/ || 'A senha deve conter pelo menos 1 letra maiúscula, 1 letra e 1 número',
    ]
  }),
  methods: {
    handleSubmit() {
      alert('Chama a rota para criar registrar o usuário');
    },
  },
};
</script>

<style lang="scss" scoped>
.register__title {
  margin: 5rem 0 2rem;
}
</style>
